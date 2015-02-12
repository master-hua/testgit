<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<HTML>
	<HEAD>
		<title>十分抱歉，系统管理员未给你分配权限，不能访问此页面！</title>
		<META http-equiv=Content-Type content="text/html; charset=utf-8">
		<base href="<%=basePath%>">
		<STYLE type=text/css>
		INPUT {
			FONT-SIZE: 12px
		}
		
		TD {
			FONT-SIZE: 12px
		}
		
		.p2 {
			FONT-SIZE: 12px
		}
		
		.p6 {
			FONT-SIZE: 12px;
			COLOR: #1b6ad8
		}
		
		A {
			COLOR: #1b6ad8;
			TEXT-DECORATION: none
		}
		
		A:hover {
			COLOR: red
		}
		</STYLE>
	</HEAD>
	<BODY oncontextmenu="return false" onselectstart="return false">
		<P align=center>
		</P>
		<P align=center>
		</P>
		<TABLE cellSpacing=0 cellPadding=0 width=540 align=center border=0>
			<TBODY>
				<TR>
					<TD vAlign=top height=270>
						<DIV align=center>
							<BR>
							<IMG height=211 src="images/error.gif" width=329>
							<BR>
							<BR>
							<TABLE cellSpacing=0 cellPadding=0 width="80%" border=0>
								<TBODY>
									<TR>
										<TD>
											<FONT class=p2>&nbsp;&nbsp;&nbsp; <FONT color=#ff0000><IMG
														height=13 src="images/emessage.gif" width=12>&nbsp;无法访问本页的原因是：系统管理员未给你分配权限，不能访问此页面！</FONT>
											</FONT>
										</TD>
									</TR>
									<TR>
										<TD height=8></TD>
										<TR>
											<TD>
												<P>
													<FONT color=#000000><BR> </FONT>
												</P>
											</TD>
										</TR>
								</TBODY>
							</TABLE>
						</DIV>
					</TD>
				</TR>
			
			</TBODY>
		</TABLE>
	
	</BODY>
</HTML>