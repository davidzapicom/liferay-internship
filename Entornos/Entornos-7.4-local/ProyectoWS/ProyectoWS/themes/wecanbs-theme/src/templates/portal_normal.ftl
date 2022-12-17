<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<title>${html_title}</title>

	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
	<script src="https://kit.fontawesome.com/65b6be5ea3.js" crossorigin="anonymous"></script>
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<div class="d-flex flex-column min-vh-100">
	<@liferay.control_menu />

	<div class="d-flex flex-column flex-fill position-relative" id="wrapper">
		<#if show_header>
			<header id="banner">
				<div class="navbar navbar-classic navbar-top py-3 proyecto">
					<div class="container-fluid container-fluid-max-xl user-personal-bar">
						<div class="align-items-center autofit-row">
							<a class="${logo_css_class} align-items-center d-md-inline-flex d-sm-none d-none logo-md" href="${site_default_url}" title="<@liferay.language_format arguments="${site_name}" key="go-to-x" />">
								<img alt="${logo_description}" class="mr-2" height="56" src="${site_logo}" />

								<#if show_site_name>
									<h1 class="font-weight-bold h2 mb-0 text-dark">${site_name}</h1>
								</#if>
							</a>

							<#assign preferences = freeMarkerPortletPreferences.getPreferences({"portletSetupPortletDecoratorId": "barebone", "destination": "/search"}) />

							<div class="autofit-col autofit-col-expand">
								<#if show_header_search>
									<div class="justify-content-md-end mr-4 navbar-form" role="search">
										<@liferay.search_bar default_preferences="${preferences}" />
									</div>
								</#if>
							</div>

							<div class="autofit-col user-color">
								<@liferay.user_personal_bar />
							</div>
						</div>
					</div>
				</div>

				<div class="navbar navbar-classic navbar-expand-md navbar-light pb-3 proyecto">
					<div class="container-fluid container-fluid-max-xl">
						<a class="${logo_css_class} align-items-center d-inline-flex d-md-none logo-xs" href="${site_default_url}" rel="nofollow">
							<img alt="${logo_description}" class="mr-2" height="56" src="${site_logo}" />

							<#if show_site_name>
								<h2 class="font-weight-bold h2 mb-0 text-dark">${site_name}</h2>
							</#if>
						</a>

						<#include "${full_templates_path}/navigation.ftl" />
					</div>
				</div>
			</header>
		</#if>

		<section class="${portal_content_css_class} flex-fill" id="content">
			<h2 class="sr-only">${htmlUtil.escape(the_title)}</h2>

			<#if selectable>
				<@liferay_util["include"] page=content_include />
			<#else>
				${portletDisplay.recycle()}

				${portletDisplay.setTitle(the_title)}

				<@liferay_theme["wrap-portlet"] page="portlet.ftl">
					<@liferay_util["include"] page=content_include />
				</@>
			</#if>
		</section>

		<#if show_footer>
			<!-- Footer -->
			<footer id="footer" role="contentinfo" class="text-center text-lg-start bg-light text-muted">
			  <!-- Section: Social media -->
			  <section style="background-color: #f08a7b; color: #123421;">
			      <!-- Instagram -->
			      <a
			        class="btn btn-link btn-floating btn-lg text-dark m-1"
			        href="https://www.instagram.com/wecanbs"
			        role="button"
			        data-mdb-ripple-color="dark"
			        ><i class="fab fa-instagram"></i
			      ></a>
			      
			      <!-- Facebook -->
			      <a
			        class="btn btn-link btn-floating btn-lg text-dark m-1"
			        href="https://www.facebook.com/wecanbs"
			        role="button"
			        data-mdb-ripple-color="dark"
			        ><i class="fab fa-facebook-f"></i
			      ></a>
			
			      <!-- Linkedin -->
			      <a
			        class="btn btn-link btn-floating btn-lg text-dark m-1"
			        href="https://linkedin.com/company/wecanbs"
			        role="button"
			        data-mdb-ripple-color="dark"
			        ><i class="fab fa-linkedin"></i
			      ></a>
		    	</section>
			  <!-- Section: Social media -->
			
			  <!-- Section: Links  -->
			  <section style="background-color: #9c6b5b; color: #123421;">
			    <div class="container text-center text-md-start pt-5">
			      <!-- Grid row -->
			      <div class="row mt-3">
			        <!-- Grid column -->
			        <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
			          <!-- Content -->
						<img alt="${logo_description}" class="mr-2" height="56" src="${site_logo}" />
			          <p>
			            Lo que esperas es lo que te llega.
			          </p>
			        </div>
			        <!-- Grid column -->
			
			        <!-- Grid column -->
			        <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
			          <!-- Links -->
			          <h6 class="text-uppercase fw-bold mb-4">
			            Páginas
			          </h6>
			          <p>
			            <a href="#!" class="text-reset">Home</a>
			          </p>
			          <p>
			            <a href="#!" class="text-reset">Tienda</a>
			          </p>
			          <p>
			            <a href="#!" class="text-reset">Contacto</a>
			          </p>
			        </div>
			        <!-- Grid column -->
			
			        <!-- Grid column -->
			        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
			          <!-- Links -->
			          <h6 class="text-uppercase fw-bold mb-4">
			            Links Legales
			          </h6>
			          <p>
			            <a href="#!" class="text-reset">Legal</a>
			          </p>
			          <p>
			            <a href="#!" class="text-reset">Condiciones de uso</a>
			          </p>
			          <p>
			            <a href="#!" class="text-reset">Política de privacidad</a>
			          </p>
			        </div>
			        <!-- Grid column -->
			
			        <!-- Grid column -->
			        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
			          <!-- Links -->
			          <h6 class="text-uppercase fw-bold mb-4">Contactar</h6>
			          <p><i class="fas fa-home me-3"></i> Asturias, España</p>
			          <p><a class="text-reset" href="mailto:contacto@wecanbs.com">
			            <i class="fas fa-envelope me-3"></i>
			            Contacto@wecanbs.com</a>
			          </p>
			          <p><a class="text-reset" href="tel:+34613009524"><i class="fas fa-phone me-3"></i> +34 613 00 95 24</a></p>
			        </div>
			        <!-- Grid column -->
			      </div>
			      <!-- Grid row -->
			    </div>
			  </section>
			  <!-- Section: Links  -->
			
			  <!-- Copyright -->
			  <div class="text-center p-4" style="background-color: #715848; color: #123421;">
			    <a class="text-reset fw-bold" href="https://wecanbs.com/">&copy;2022 WECANBS</a>
			  </div>
			  <!-- Copyright -->
			</footer>
			<!-- Footer -->
		</#if>
	</div>
</div>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>

</html>