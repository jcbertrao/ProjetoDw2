<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Cadastro de cliente</title>

        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="/paginas/cabecalho.html" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style type="text/css">
            div.um{
                margin-left:6px;
                margin-top:6px;
                float:left;
            }
            input.inp{
                border:solid 1px;
                border-radius: 6px;
                width:300px;
                height: 25px;
            }
            div.dois{
                margin-left:280px;
                margin-top:65px;
                float:left;
            }
            div.tres{
                margin-top:67px;
                margin-left:40px;
                float:left;
            }
        </style>

    </head>

    <body bgcolor="black">
        <header >
            <div class="um"><img src="inicio.png"alt="Computer Man" style="width:520px;height:89px;"/></div>

            <div class="dois">
                <input type="text" class="inp" placeholder="Pesquisar..."/> 
                <button type="button">Buscar</button>
            </div>
            <div class="tres">
                <button type="button">Registre-se</button>
                <button type="button">Entrar</button>
            </div>
        </header>

        <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Cadastro</h1>
                </div>
            </div>
            <div class="panel-heading">
                Cliente
            </div>
            <div class="panel-body">
                <div class="col-lg-6">
                    <form role="form" action="${pageContext.request.contextPath}/cliente">
                        <div class="form-group">
                            <label>CPF</label>
                            <input class="form-control" name="cpfCliente">
                        </div>
                        <div class="form-group">
                            <label>Login</label>
                            <input class="form-control" name="loginCliente">
                        </div>
                        <div class="form-group">
                            <label>Senha</label>
                            <input type="password" name="senhaCliente" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Nome</label>
                            <input class="form-control" name="nomeCliente">
                        </div>
                        <div class="form-group">
                            <label>Rua</label>
                            <input class="form-control" name="ruaCliente">
                        </div>
                        <div class="form-group">
                            <label>Número da Casa</label>
                            <input class="form-control" name="numeroCasaCliente">
                        </div>
                        <div class="form-group">
                            <label>CEP</label>
                            <input class="form-control" name="cepCliente">
                        </div>
                        <button type="submit" class="btn btn-default">Enviar dados</button>
                        <button type="reset" class="btn btn-default">Apagar dados</button>
                    </form>
                </div>
            </div>
    </body>
</html>