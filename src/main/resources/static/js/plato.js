$(document).ready(function(){
	$('body').on('click','.editarPlato', function(){
		document.getElementById("categoria.id").value=$(this).attr('param1');
		$('#id').val($(this).attr('id'));
		$('#nombre').val($(this).attr('param2'));
		$('#moneda').val($(this).attr('param3'));
		$('#precio').val($(this).attr('param4'));

	})
});