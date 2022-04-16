$(document).ready(function(){
	$('body').on('click','.editarFactura', function(){
		document.getElementById("cliente.id").value=$(this).attr('param1');
		$('#id').val($(this).attr('id'));
		$('#txtDescripcion').val($(this).attr('param2'));
		$('#txtObservacion').val($(this).attr('param3'));
	})
});