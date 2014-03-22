
$(document).ready(function()
		{
			bindfunctions();
		});


function bindfunctions()
{
	$('body').find('#qlinktable').find('tr').each(function(){
		
		console.log("Hi");
		
		$(this).find('td').click(function()
				{
			alert($(this).attr('id'));
				});
		
	});
}
