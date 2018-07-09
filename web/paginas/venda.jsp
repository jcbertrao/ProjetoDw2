<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Bootstrap Admin Theme</title>

        <!-- Bootstrap Core CSS -->
        <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- DataTables CSS -->
        <link href="../vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

        <!-- DataTables Responsive CSS -->
        <link href="../vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

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

    <body>
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
        <div>
            <table width="100%" class="table table-striped table-bordered table-hover">
                <thead>
                    <tr>
                        <th> Id Venda </th>
                        <th> Data </th>
                        <th> CPF Cliente</th>
                    </tr>
                </thead>
                <tbody>
                    ${resultado}
                </tbody>
            </table>
        </div>

        <script src="../vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../vendor/metisMenu/metisMenu.min.js"></script>

        <!-- DataTables JavaScript -->
        <script src="../vendor/datatables/js/jquery.dataTables.min.js"></script>
        <script src="../vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
        <script src="../vendor/datatables-responsive/dataTables.responsive.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../dist/js/sb-admin-2.js"></script>

        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
            $(document).ready(function () {
                $('#dataTables-example').DataTable({
                    responsive: true
                });
            });
        </script>

    </body>

</html>
