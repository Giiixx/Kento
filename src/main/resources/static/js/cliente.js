$(document).ready(function(){
	$('body').on('click', '.editarCliente',function(){
		$('#id').val($(this).attr('id'));
		$('#txtNombre').val($(this).attr('param1'));
		$('#txtApellido').val($(this).attr('param2'));
		$('#txtCorreo').val($(this).attr('param3'));
		$('#txtFecha').val($(this).attr('param4'));
	})
});