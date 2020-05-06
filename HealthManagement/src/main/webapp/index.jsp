
<%@ page import="java.util.List"%>
<%@ page
	import="com.pafProject.HealthManagement.Patient.CustomerDataModel"%>

<!DOCTYPE html>
<head>

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="view/bootstrap.min.css">
<script src="component/jquery-3.5.0.min.js"></script>
<script src="component/Patient.js"></script>
</head>

<body>
	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
		<span class="navbar-brand mb-0 h1"> Hospital Management System</span>
		<span class="navbar-text">HOME</span>
	</nav>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm">
				<div class="">
					<form id="pat_Form" name="pat_Form" method="post"
						action="index.jsp">

						<div class="form-group col-md-6">
							<div class="form-group ">
								<label for="IdentyCardNumber">NIC</label> <input type="text"
									class="form-control" id="nic" name="nic"
									placeholder="980451465V" required>
							</div>
							<div class="form-row">
								<div class="form-group col-md-6">
									<label for="firstname">First Name</label> <input type="text"
										class="form-control" id="f_name" name="f_name" placeholder="">
								</div>
								<div class="form-group col-md-6">
									<label for="lastname">Last Name</label> <input type="text"
										class="form-control" id="l_name" name="l_name" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="patientEmail">Email</label> <input type="email"
									class="form-control" id="pat_mail" name="pat_mail"
									placeholder="">
							</div>
							<div class="form-group">
								<label for="contactNumber">Phone Number</label> <input
									type="text" class="form-control" id="mob_num" name="mob_num"
									placeholder="">
							</div>
							<div class="form-group">
								<label for="patbirthday">Birthday</label> <input type="date"
									class="form-control" id="p_bday" name="p_bday" placeholder="">
							</div>
							<div class="form-group">
								<label for="pataddress">Address</label> <input type="text"
									class="form-control" id="addr" name="addr" placeholder="">
							</div>
							<div class="form-group ">
								<label for="patpassword">Password</label> <input type="password"
									class="form-control" id="pass" name="pass" placeholder="">
							</div>
							<br> <input id="btnSave" name="btnSave" type="button"
								value="Save" class="btn btn-primary"> <input
								id="hidPatSave" name="hidPatSave" type="hidden" value="">
						</div>
						<br>
						
						<div id="alertSuccess" class="alert alert-success"></div>
			<div id="alertError" class="alert alert-danger"></div>
					</form>
				</div>
				<br>
			</div>
			

		</div>
		
			<div class="row">
			
				<div class="col-sm">
					<div id="divItemsGrid">
						<%
						CustomerDataModel itemObj = new CustomerDataModel();
						out.print(itemObj.getCustomers());
					%>
					</div>
				</div>
			</div>
	</div>
		
</body>
</html>
