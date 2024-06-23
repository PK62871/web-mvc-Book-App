<html>
<head>
<body>

	<h3>Enter Book Id Which You Want :--</h3>
	<form action="book">
		Book Id :- <input type="text" name="id" /> <input type="submit"
			value="Search" />
	</form>
	
	<hr>
	

	Book Id:- ${book.bookId}<br/>
	Book Name:- ${book.bookName}<br/>
	 Book Price:- ${book.bookPrice}<br/>
	 
	 <hr>
	 ${msg}
</body>
</head>
</html>