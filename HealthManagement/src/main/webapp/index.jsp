<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="view/bootstrap.min.css">
</head>

<body>
<div class="container">
  <div class="row">
    <div class="col-sm">
    	<h3>
  			Patient Adding Form
  		<small class="text-muted">Admin Side</small>
		</h3>
		
		<form>
		<div class="form-group col-md-6">
			<div class="form-group ">
				<label for="IdentyCardNumber">NIC</label>
    			<input type="text" class="form-control" id="nic" name="nic" placeholder="980451465V">
			</div>
			
			<div class="form-row">
			<div class="form-group col-md-6">
				<label for="firstname">First Name</label>
    			<input type="text" class="form-control" id="f_name" name="f_name" placeholder="">
			</div>
			<div class="form-group col-md-6">
				<label for="lastname">Last Name</label>
    			<input type="text" class="form-control" id="l_name" name="l_name" placeholder="">
			</div>
			</div>
			
			<div class="form-group">
				<label for="patientEmail">Email</label>
    			<input type="email" class="form-control" id="pat_mail" name="pat_mail" placeholder="">
			</div>
			<div class="form-group">
				<label for="contactNumber">Phone Number</label>
    			<input type="text" class="form-control" id="mob_num" name="mob_num" placeholder="">
			</div>
			<div class="form-group">
				<label for="patbirthday">Birthday</label>
    			<input type="date" class="form-control" id="p_bday" name="p_bday" placeholder="">
			</div>
			<div class="form-group">
				<label for="pataddress">Address</label>
    			<input type="text" class="form-control" id="addr" name="addr" placeholder="">
			</div>
			
			<div class="form-row">
			<div class="form-group col-md-6">
				<label for="patpassword">Password</label>
    			<input type="password" class="form-control" id="pass" name="pass" placeholder="">
			</div>
			<div class="form-group col-md-6">
				<label for="pat2password">Type Password Again</label>
    			<input type="password" class="form-control" id="c_pass" name="c_pass" placeholder="">
			</div>
			</div>
		</div>	
		</form>
      
    </div>
  </div>
</div>

  <h2>Jersey RESTful Web Application!</h2>
    <p><a href="customerapi/Customer">Jersey resource</a>
    <p>Visit <a href="http://jersey.java.net">Project Jersey website</a>
    for more information on Jersey!
</body>
</html>
