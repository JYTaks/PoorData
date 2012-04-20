<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="login">
	<table>
	<tr height="8px"><td></td></tr>
	<tr height="25px">
		<td><input type="text" style="width:200px" id="email" name="email" value=""></td>
		<td><input type="checkBox" id="autoLogin" name="autoLogin"> ID저장</td>
	</tr>
	<tr height="25px">
		<td><input type="password" style="width:200px" value=""></td>
		<td><span class="button medium"><a href="#">LOGIN</a></span></td>
	</tr>
	<tr>
		<th colspan="2">
			<a href="#" onclick="Perm.join();">회원가입</a> |
			<a href="#">아이디/비밀번호 찾기</a>
		</th>
	</tr>
	</table>
</div>