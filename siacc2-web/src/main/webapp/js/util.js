 
 
function soNumero(e) {// Só aceita numero e virgulas
	// números de 0 a 9 tab ctrl C, V e X (quando tiver o CTRL apertado)
	// ev.charCode

	if (navigator.appName.indexOf('Internet Explorer') > 0) {
		// O evento keyCode funciona só no navegador IE
		if ((e.keyCode > 47 && e.keyCode < 58)
				|| (e.keyCode == 9 || e.keyCode == 17 || (e.ctrlKey && (e.keyCode == 86
						|| e.keyCode == 118
						|| e.keyCode == 88
						|| e.keyCode == 120 || e.keyCode == 67 || e.keyCode == 99)))) {
			return true;
		} else {
			return false;
		}
	} else {
		// alert(e.charCode);
		// Não funciona no Internet Explorer
		if ((e.charCode > 47 && e.charCode < 58)
				|| e.charCode == 0
				|| (e.charCode == 9 || e.charCode == 17 || (e.ctrlKey && (e.charCode == 86
						|| e.charCode == 118
						|| e.charCode == 88
						|| e.charCode == 120 || e.charCode == 67 || e.charCode == 99)))) {
			return true;
		} else {
			return false;
		}
	}

}