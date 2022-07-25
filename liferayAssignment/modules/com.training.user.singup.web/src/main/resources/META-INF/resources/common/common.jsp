<script type="text/javascript">
function validateFirstName(){
	$("#<portlet:namespace/>first-name-error").html("");
	$("#<portlet:namespace/>first-name-error").hide();
	var firstName = $("#<portlet:namespace/>first-name").val();
	if(firstName==""  || firstName==null ||typeof firstName=="undefined"){
		$("#<portlet:namespace/>first-name-error").html("Enter First Name.");
		$("#<portlet:namespace/>first-name-error").show();
		return false;	
	}
	return true;
}

function addRecord(){
	var firstName= $("#<portlet:namespace/>first-name").val();
	var middleName= $("#<portlet:namespace/>middle-name").val();
	var lastName= $("#<portlet:namespace/>last-name").val();
	var emailAddress = $("#<portlet:namespace/>email-address").val();
	var mobile = $("#<portlet:namespace/>mobile").val();
	var city = $("#<portlet:namespace/>city").val();
	var state = $("#<portlet:namespace/>state").val();
	var gender = $("#<portlet:namespace/>gender").val();
	var pinCode = $("#<portlet:namespace/>pin-code").val();
	console.log("firstName"+firstName+" middleName"+middleName+" gender"+gender);
	$.ajax({
        url : '${resourceURL}',
        type: 'POST',
        dataType : "text",
        data : {
        	"<portlet:namespace/>firstName" :firstName,
        	"<portlet:namespace/>middleName" :middleName,
        	"<portlet:namespace/>lastName" :lastName,
        	"<portlet:namespace/>emailAddress" :emailAddress,
        	"<portlet:namespace/>mobile" :mobile,
        	"<portlet:namespace/>city" :city,
        	"<portlet:namespace/>state" :state,
        	"<portlet:namespace/>gender" :gender,
        	"<portlet:namespace/>pinCode" :pinCode,
	    	"<portlet:namespace/>cmd" : "addRecord"
        },
        success : function(data) {
        		$("#<portlet:namespace/>welcome").html(data);
        		$("#<portlet:namespace/>parent").hide();
        		$("#<portlet:namespace/>welcome").show();
        },
        error: function () {
           
        }
	});
}

</script>