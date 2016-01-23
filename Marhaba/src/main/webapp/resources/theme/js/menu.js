function initMenu() {
	$('#menu1 ul').hide();
	// $('#menu ul:first').show();
	$('#menu1 li a').click(function() {
		var checkElement = $(this).next();
		if ((checkElement.is('ul')) && (checkElement.is(':visible'))) {
			$('#menu1 ul:visible').slideUp('normal');
			return false;
		}
		if ((checkElement.is('ul')) && (!checkElement.is(':visible'))) {
			$('#menu1 ul:visible').slideUp('normal');
			checkElement.slideDown('normal');
			return false;
		}
	});
}
$(document).ready(function() {
	// alert("Hi");
	initMenu();
	$("#name1").focus(function(){
		//alert("HI");
		if (this.value == "type the name of employee to search")
		{
		    this.value = "";
		    $(this).css('color','#000000');
		 }
		});

		$("#name1").blur(function(){

		        if (this.value == "")
		        {
		            this.value = "type the name of employee to search";
		            $(this).css('color','#a9a9a9');
		        }
		    });
});

;