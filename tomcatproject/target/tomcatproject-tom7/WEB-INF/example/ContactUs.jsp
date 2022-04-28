<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<html>
<head>
  <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="description">
    <meta content="" name="keywords">
   
  
    <!-- Google Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=EB+Garamond:wght@400;500&family=Inter:wght@400;500&family=Playfair+Display:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
  
    <!-- Vendor CSS Files -->
  
    <link href="/tomcatproject/src/assets/vendor/bootstrap/css/bootstrap-grid.min.css" rel="stylesheet">
    <link href="/tomcatproject/src/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="/tomcatproject/src/assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
    <link href="/tomcatproject/src/assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="/tomcatproject/src/assets/vendor/aos/aos.css" rel="stylesheet">
    <!-- Template Main CSS Files -->
   
    <link href="/tomcatproject/src/assets/css/variables.css" rel="stylesheet">
    <link href="/tomcatproject/src/assets/css/main.css" rel="stylesheet">
    <style>
        ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: #333;
        }
        
        li {
          float: left;
        }
        
        li a {
          display: block;
          color: white;
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
        }
        
        li a:hover {
          background-color: #111;
        }
            </style>
</head>

<body>
    <h1>My first Tomcat Activity</h1>
    <ul >
        <li>
            <s:url var="Home" action="/"/>
            <s:a href = "%{Home}">Home</s:a>
        </li>
        <li>
          <s:url var="About" action="About"/>
          <s:a href = "%{About}">About</s:a>
      </li>
        <li> 
          <s:url var="OurServices" action="OurServices"/>
          <s:a href = "%{OurServices}">OurServices</s:a>
        </li>
        <li>
          <s:url var="ContactUs" action="ContactUs"/>
          <s:a href = "%{ContactUs}">ContactUs</s:a>
        </li>
      
    </ul>
    <main id="main">
      <section id="contact" class="contact mb-5">
        <div class="container" data-aos="fade-up">
  
          <div class="row">
            <div class="col-lg-12 text-center mb-5">
              <h1 class="page-title">Contact us</h1>
            </div>
          </div>
  
          <div class="row gy-4">
  
            <div class="col-md-4">
              <div class="info-item">
                <i class="bi bi-geo-alt"></i>
                <h3>Address</h3>
                <address>A108 Adam Street, NY 535022, USA</address>
              </div>
            </div><!-- End Info Item -->
  
            <div class="col-md-4">
              <div class="info-item info-item-borders">
                <i class="bi bi-phone"></i>
                <h3>Phone Number</h3>
                <p><a href="tel:+155895548855">+1 5589 55488 55</a></p>
              </div>
            </div><!-- End Info Item -->
  
            <div class="col-md-4">
              <div class="info-item">
                <i class="bi bi-envelope"></i>
                <h3>Email</h3>
                <p><a href="mailto:info@example.com">info@example.com</a></p>
              </div>
            </div><!-- End Info Item -->
  
          </div>
  
          <div class="form mt-5">
            <form action="forms/contact.php" method="post" role="form" class="php-email-form">
              <div class="row">
                <div class="form-group col-md-6">
                  <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" required>
                </div>
                <div class="form-group col-md-6">
                  <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required>
                </div>
              </div>
              <div class="form-group">
                <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" required>
              </div>
              <div class="form-group">
                <textarea class="form-control" name="message" rows="5" placeholder="Message" required></textarea>
              </div>
              <div class="my-3">
                <div class="loading">Loading</div>
                <div class="error-message"></div>
                <div class="sent-message">Your message has been sent. Thank you!</div>
              </div>
              <div class="text-center"><button type="submit">Send Message</button></div>
            </form>
          </div><!-- End Contact Form -->
  
        </div>
      </section>
  
    </main><!-- End #main -->
</body>
</html>
