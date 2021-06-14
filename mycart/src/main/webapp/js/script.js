function add_to_cart(pid,pname,price){
	let cart = localStorage.getItem("cart");
	//checks if cart is present or not
	if(cart==null){
		//cart is not present
		let products=[];
		let product={productId:pid,productName:pname,productQuantity:1,productPrice:price};
		products.push(product);
		localStorage.setItem("cart",JSON.stringify(products));
		console.log("Product is added for the first time");
		showToast("Product is added for the first time");
	}
	else{
		let pcart=JSON.parse(cart);
		
		let oldProduct=pcart.find((item) => item.productId==pid);
		
		if(oldProduct){
			//increase the quantity
			oldProduct.productQuantity=oldProduct.productQuantity+1;
			pcart.map((item)=>{
				
				if(item.productId==oldProduct.productId){
					item.productQuantity=oldProduct.productQuantity;
				}
			})
			localStorage.setItem("cart",JSON.stringify(pcart));
			console.log("Product Quantity is increased");
			showToast("Product Quantity is increased");
		}
		else{
			//we have to add the product
			let product={productId:pid,productName:pname,productQuantity:1,productPrice:price};
			pcart.push(product);
			localStorage.setItem("cart",JSON.stringify(pcart));
			console.log("Product is added to the existing cart");
			showToast("Product is added to the existing cart");
		}
	}
	updateCart();
}

//update cart

function updateCart(){
	let cartString=localStorage.getItem("cart");
	let cart=JSON.parse(cartString);
	if(cart==null || cart.length==0){
		console.log("Cart is empty");
		$(".cart-items").html("( 0 )");
		$(".cart-body").html("<h3>Cart does not have any items</h3>");
		$(".checkout-btn").addClass('disabled');
		$(".checkout-btn").removeAttr("onclick");
	}
	
	else{
		//cart contains some items
		console.log(cart);
		
		let totalItems=0;
		cart.map((item)=>{
			totalItems+=item.productQuantity;
		})
		
		$(".cart-items").html(`( ${totalItems} )`);
		let table= `
			<table class='table'>
			<thead class='thead-light'>
				<tr>
					<th>Item Name</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Total Price</th>
					<th>Action</th>
				</tr>
			</thead>		
		
		`;
		
		//traversing the cart using map function
		let totalPrice=0;
		cart.map((item)=>{
			table+=`
				<tr>
					<td>${item.productName}</td>
					<td>${item.productPrice}</td>
					<td>${item.productQuantity}</td>
					<td>${item.productQuantity * item.productPrice}</td>
					<td><button class="btn btn-danger" onclick='deleteItemFromCart(${item.productId})'>Remove</button></td>
				</tr>
			`
			totalPrice+=item.productPrice*item.productQuantity;
		})
		table=table+`
			<tr><td colspan='5' id='amount' class='text-right font-weight-bold m-5'>Total Price : ${totalPrice} </td></tr>
		
		</table>`;
		$(".cart-body").html(table);
		$(".checkout-btn").removeClass('disabled');
		$(".checkout-btn").attr('onclick','goToCheckout()');
		
	}	
}

//deleting items from cart
function deleteItemFromCart(pid){
	let cart=JSON.parse(localStorage.getItem("cart"));
	cart.map((item)=>{
		if(item.productId==pid){
			item.productQuantity--;
		}
	})
	let newCart=cart.filter((item)=>item.productQuantity!=0);
	localStorage.setItem("cart",JSON.stringify(newCart));
	showToast("Removed from Cart");
	updateCart();
}


$(document).ready(function(){
	updateCart();
})

function showToast(content){
	$('#toast').addClass("display");
	$('#toast').html(content);
	setTimeout(()=>{
		$('#toast').removeClass("display");
	} , 2000);
}

function goToCheckout(){
	window.location = "checkout.jsp";
}

function clearProducts(){
	localStorage.clear();
}


const paymentStart = () =>{
	console.log("Payment started");
	let amount = $("#amount")[0].innerHTML;
	amount=amount.substring(13);
	//Total Price : 105152 
	alert(amount);
	
	//send request to server to create order
	$.ajax(
		{
			url:'/user/create_order',
			data:JSON.stringify({amount:amount,info:'order_request'}),
			contentType:'application/json',
			type:'POST',
			dataType:'json',
			success:function(response){
				//invoked when success
			},
			error:function(error){
				//invoked when error
				console.log(error);
				alert("something went wrong");
			}
		}
	)
};
