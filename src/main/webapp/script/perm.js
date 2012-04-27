var Perm = {
	join : function(){
		$('#layer').fadeTo('slow', 0.7);
		
		var $popJoin = $('#popJoin');
		var left = ( $(window).scrollLeft() + ($(window).width() - $popJoin.width()) / 2 );
		var top = ( $(window).scrollTop() + ($(window).height() - $popJoin.height()) / 2 );
		$popJoin.css({'left':left, 'top':top});
		$popJoin.show();
	},
	
	joinClose : function(){
		$('#popJoin').hide();
		$('#layer').fadeOut('slow');
	},
	
	dupChkNickname : function(jsonData){
		alert(jsonData);
	}
};