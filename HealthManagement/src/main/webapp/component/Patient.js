var type  = ($("#hidPatSave").val() == "") ? "POST" : "PUT";

$.ajax(
		{
			url: "PatientAPI",
			type: type,
			data : $("pat_Form").serialize(),
			dataType :"text",
			complete : function(response,status)
			{
				onItemSaveComplete(response.responseText, status); 
			}
		});

function onItemSaveComplete(response, status)
{
	if (status == "success")
	{
		var resultSet = JSON.parse(response);
		
		if (resultSet.status.trim() == "success")
		{
			$("#alertSuccess").text("Successfully saved.");
			$("#alertSuccess").show();
			
			$("#divItemsGrid").html(resultSet.data);
		} else if (resultSet.status.trim() == "error")
		{
			$("#alertError").text(resultSet.data);
			$("#alertError").show();
		}
	} else if (status == "error")
	{
		$("#alertError").text("Error while saving.");
		$("#alertError").show();
	} else
	{
		$("#alertError").text("Unknown error while saving..");
		$("#alertError").show();
	}
	
	$("#hidPatSave").val("");
	$("#pat_Form")[0].reset();
}
