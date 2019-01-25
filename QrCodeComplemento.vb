' //Uso do QR-Code com VBA para o preenchimento de planilha
' //https://www.extendoffice.com/pt/documents/excel/5404-excel-create-qr-code.html

Sub setQR()
'Updated by Extendoffice 2018/8/22
    Dim xSRg As Range
    Dim xRRg As Range
    Dim xObjOLE As OLEObject
    On Error Resume Next
    Set xSRg = Application.InputBox("Please select the cell you will create QR code based on", "Kutools for Excel", , , , , , 8)
    If xSRg Is Nothing Then Exit Sub
    Set xRRg = Application.InputBox("Select a cell to place the QR code", "Kutools for Excel", , , , , , 8)
    If xRRg Is Nothing Then Exit Sub
    Application.ScreenUpdating = False
    Set xObjOLE = ActiveSheet.OLEObjects.Add("BARCODE.BarCodeCtrl.1")
    xObjOLE.Object.Style = 11
    xObjOLE.Object.Value = xSRg.Text
    ActiveSheet.Shapes.Item(xObjOLE.Name).Copy
    ActiveSheet.Paste xRRg
    xObjOLE.Delete
    Application.ScreenUpdating = True
End Sub