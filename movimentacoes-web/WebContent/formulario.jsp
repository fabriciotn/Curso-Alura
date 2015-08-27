<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
</head>
<body>

<form action="movimentacoes" method="POST">

	<input type="radio" name="tipo" value="SAIDA">SAIDA<br>
	<input type="radio" name="tipo" value="ENTRADA">ENTRADA<br><br>


	Gerar a pesquisa movimentações.<br>
	<input type="submit" value="Gera relatório" />

</form>
</body>
</html>