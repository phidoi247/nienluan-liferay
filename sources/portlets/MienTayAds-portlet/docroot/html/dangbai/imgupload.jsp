<form name="uploadForm" action="#"
	enctype="multipart/form-data" method="post">
	<input type="file" name="file" /> <input TYPE=Button name='Upload'
		Value='Upload'
		onClick="uploadForm.Upload.value='Uploading...';document.uploadForm.action='imgupload.jsp';document.uploadForm.submit()">
</form>
