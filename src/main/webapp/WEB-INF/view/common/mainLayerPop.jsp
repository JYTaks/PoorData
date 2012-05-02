<%@page import="com.poordata.util.PropUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="layer">
</div>
<div id="popJoin">
	<h3>MemberShip</h3>
	<table border="1">
	<tr height="25px">
		<td width="100px">E-Mail</td>
		<td align="left">
			<input type="text" style="width:205px;" id="joinEmail" name="joinEmail">
			<span class="button medium"><a href="#" onclick="Common.ajax('<%=PropUtil.getWebUrl() %>/ajax/dupChkEmail.pd?joinEmail='+$('#joinEmail').val(),'GET', Perm.dupChkEmailParam, Perm.dupChkEmail)">중복체크</a></span>
		</td>
	</tr>
	<tr height="25px">
		<td width="">Password</td>
		<td align="left"><input type="text" style="width:98%" id="joinPwd" name="joinPwd"></td>
	</tr>
	<tr height="25px">
		<td width="">Password 확인</td>
		<td align="left"><input type="text" style="width:98%" id="joinChkPwd" name="joinChkPwd"></td>
	</tr>
	<tr height="25px">
		<td width="">Nickname</td>
		<td align="left">
			<input type="text" style="width:205px;" id="joinNickname" name="joinNickname">
			<span class="button medium"><a href="#"  onclick="Common.ajax('<%=PropUtil.getWebUrl() %>/ajax/dupChkNickname.pd?joinNickname='+$('#joinNickname').val(),'GET', Perm.dupChkNicknameParam, Perm.dupChkNickname)">중복체크</a></span>
		</td>
	</tr>
	<tr>
		<td colspan="2" align="right">
			<span class="button medium"><a href="#" onclick="Perm.join()">회원가입</a></span> |
			<span class="button medium"><a href="#" onclick="Perm.joinClose();">취소</a></span>
		</td>
	</tr>
	</table>
</div>
