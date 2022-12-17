<%@ include file="/init.jsp" %>

<% String path = request.getContextPath()+"/img/"; %>

<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="<%=path%>home-slider-1.jpg" alt="First slide">
      <div class="carousel-caption d-none d-md-block">
	    <h5><b><liferay-ui:message key="home-carousel.titulo1"/></b></h5>
	  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="<%=path%>home-slider-2.jpg" alt="Second slide">
      <div class="carousel-caption d-none d-md-block">
	    <h5>...</h5>
	  </div>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="<%=path%>home-slider-3.jpg" alt="Third slide">
      <div class="carousel-caption d-none d-md-block">
	    <h5>...</h5>
	  </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>