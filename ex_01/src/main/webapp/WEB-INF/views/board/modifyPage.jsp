<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">READ BOARD</h3>
				</div>
				<!-- /.box-header -->

<form role="form" method="post">

	<div class="box-body">
		
		<input type='hidden' name='page' value="${cri.page}">
		<input type='hidden' name='perPageNum' value="${cri.perPageNum}">
		
		<div class="form-group">
			<label for="exampleInputEmail">BNO</label>
			<input type="text" name='bno' class="form-control" value="${boardVO.bno}" 
			readonly="readonly">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail">Title</label>
			<input type="text" name='title' class="form-control" value="${boardVO.title}" 
			readonly="readonly">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail">Content</label>
			<textarea name='content' class="form-control" rows="3">
			${boardVO.content}</textarea>
		</div>
		<div class="form-group">
			<label for="exampleInputEmail">Writer</label>
			<input type="text" name='writer' class="form-control" value="${boardVO.writer}" 
			readonly="readonly">
		</div>
	</div>
	<!-- /.box-body -->
</form>


<div class="box-footer">
	<button type="submit" class="btn btn-primary">SAVE</button>
	<button type="submit" class="btn btn-warning">CANCEL</button>
</div>

<script>
	$(document).ready(function(){
		var formObj = $("form[role='form']");
		
		console.log(formObj);
		
		$(".btn-warning").on("click", function(){
			self.location = "/board/listPage?page=${cri.page}$perPageNum=${cri.perPageNum}";
		});
		
		$(".btn-primary").on("click", function(){
			formObj.submit();
		});
	});
</script>




			</div>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<%@include file="../include/footer.jsp"%>
