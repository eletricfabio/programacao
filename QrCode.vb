' //Vc precisa criar um módulo dentro do VBA e escrever essa fórmula

Function QrCode(codetext As String)
   
    Dim URL As String, mycell As Range
    Set mycell = Application.Caller
       
    URL = "https://chart.googleapis.com/chart?chs=100x100&cht=qr&chl=" & codetext
    On Error Resume Next
        ativesheet.Pictures("QR_" & mycell.adress(False, False)).Delete
    On Error GoTo 0
    ActiveSheet.Pictures.Insert(URL).Select
    With Selection.ShapeRange(1)
    .PictureFormat.CropLeft = 15
    .PictureFormat.CropRight = 15
    .PictureFormat.CropTop = 15
    .PictureFormat.CropBottom = 15
    .Name = "QR_" & mycell.adress(False, False)
    .Left = mycell.Left + 2
    .Top = mycell.Top + 2
    End With


End Function

' //Então, vc entra no excel e digita em uma célula a fórmula:

' //=QRCode(A1)

' //no exemplo acima, será criado um código com as informações contidas na célula A1. É necessário conexão com a internet