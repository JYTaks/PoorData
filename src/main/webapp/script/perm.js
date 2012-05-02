var Perm = {
	popJoin : function(){
		// Init
		$('#chkNickname').val('N');
		$('#chkEmail').val('N');
		$('#joinEmail').val('');
		$('#joinPwd').val('');
		$('#joinChkPwd').val('');
		$('#joinNickname').val('');
		$('#joinNickname').removeClass();
		
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
		if(jsonData == false){
			alert('사용 할 수 있는 Nickname입니다.');
			$('#chkNickname').val('Y');
			$("#joinNickname").removeClass();
			$("#joinNickname").addClass("input ok");
		}else{
			alert('같은 Nickname이 존재 합니다.');
			$('#chkNickname').val('N');
			$("#joinNickname").removeClass();
			$("#joinNickname").addClass("input no");
		}
	},
	
	dupChkNicknameParam : function(){
		var nickname = $('#joinNickname').val();
		var result = false;
		if(nickname.length <= 0){
			alert('공백은 입력 할 수 없습니다.');
		}else{
			result = true;
		}
		return result;
	},
	
	dupChkEmail : function(jsonData){
		if(jsonData == false){
			alert('사용 할 수 있는 E-Mail 입니다.');
			$('#chkEmail').val('Y');
			$("#joinEmail").removeClass();
			$("#joinEmail").addClass("input ok");
		}else{
			alert('같은 E-Mail이 존재 합니다.');
			$('#chkEmail').val('N');
			$("#joinEmail").removeClass();
			$("#joinEmail").addClass("input no");
		}
	},
	
	dupChkEmailParam : function(){
		var email = $('#joinEmail').val();
		var result = false;
		if(email.length <= 0){
			alert('공백은 입력 할 수 없습니다.');
		}else{
			result = true;
		}
		return result;
	},
	
	join : function(){
		if($('#chkEmail').val() == 'N'){
			alert('E-Mail의 중복 체크가 되지 않았습니다.');
			return;
		}
		if($('#chkNickname').val() == 'N'){
			alert('Nickname의 중복 체크가 되지 않았습니다.');
			return;
		}
		if($('#joinPwd').val().length <= 0){
			alert('Password가 입력 되지 않았습니다.');
			return;
		}
		if($('#joinChkPwd').val().length <= 0){
			alert('Password 확인 값이 입력 되지 않았습니다.');
			return;
		}
		if($('#joinPwd').val() == $('#joinChkPwd').val()){
			alert('입력 하신 Password가 일치 하지 않습니다.');
			return;
		}
		Common.formSubmit();
	}
};