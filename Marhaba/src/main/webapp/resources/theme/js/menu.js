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
});