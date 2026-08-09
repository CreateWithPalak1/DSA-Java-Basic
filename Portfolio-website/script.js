/* ==========================================
   TYPING EFFECT
========================================== */

const words = [
  "Frontend Developer",
  "Web Designer",
  "B.Tech CSE Student",
  "Creative Coder"
];

let wordIndex = 0;
let charIndex = 0;
let deleting = false;

const typingElement = document.getElementById("typing");

function typeEffect() {

  const currentWord = words[wordIndex];

  if (!deleting) {

    typingElement.textContent =
      currentWord.substring(0, charIndex + 1);

    charIndex++;

    if (charIndex === currentWord.length) {
      deleting = true;

      setTimeout(typeEffect, 1500);
      return;
    }

  } else {

    typingElement.textContent =
      currentWord.substring(0, charIndex - 1);

    charIndex--;

    if (charIndex === 0) {

      deleting = false;

      wordIndex =
        (wordIndex + 1) % words.length;
    }
  }

  setTimeout(typeEffect,
    deleting ? 60 : 120
  );
}

typeEffect();


/* ==========================================
   CUSTOM CURSOR
========================================== */

const cursor = document.querySelector(".cursor");

document.addEventListener("mousemove", (e) => {

  cursor.style.left = e.clientX + "px";

  cursor.style.top = e.clientY + "px";

});


/* ==========================================
   NAVBAR SCROLL EFFECT
========================================== */

const navbar =
  document.querySelector("nav");

window.addEventListener("scroll", () => {

  if (window.scrollY > 50) {

    navbar.style.background =
      "rgba(0,0,0,.65)";

    navbar.style.backdropFilter =
      "blur(25px)";

    navbar.style.boxShadow =
      "0 5px 20px rgba(0,0,0,.3)";

  } else {

    navbar.style.background =
      "rgba(255,255,255,.03)";

    navbar.style.boxShadow = "none";
  }

});


/* ==========================================
   PARTICLES JS
========================================== */

particlesJS("particles-js", {

  particles: {

    number: {
      value: 80
    },

    color: {
      value: "#ffffff"
    },

    shape: {
      type: "circle"
    },

    opacity: {
      value: 0.4
    },

    size: {
      value: 3
    },

    line_linked: {

      enable: true,

      distance: 150,

      color: "#7c3aed",

      opacity: 0.3,

      width: 1
    },

    move: {

      enable: true,

      speed: 2,

      direction: "none",

      random: false
    }
  },

  interactivity: {

    detect_on: "canvas",

    events: {

      onhover: {
        enable: true,
        mode: "grab"
      },

      onclick: {
        enable: true,
        mode: "push"
      }
    }
  },

  retina_detect: true

});


/* ==========================================
   GSAP
========================================== */

gsap.registerPlugin(ScrollTrigger);


/* HERO */

gsap.from(".hero-content h3", {

  opacity: 0,

  y: 50,

  duration: 1

});

gsap.from(".hero-content h1", {

  opacity: 0,

  y: 80,

  duration: 1.2,

  delay: .2

});

gsap.from("#typing", {

  opacity: 0,

  y: 60,

  duration: 1,

  delay: .4

});

gsap.from(".hero-content p", {

  opacity: 0,

  y: 60,

  duration: 1,

  delay: .6

});

gsap.from(".buttons", {

  opacity: 0,

  y: 60,

  duration: 1,

  delay: .8

});

gsap.from(".hero-image", {

  opacity: 0,

  scale: .8,

  duration: 1.4

});


/* ABOUT */

gsap.from("#about .card", {

  scrollTrigger: {

    trigger: "#about",

    start: "top 80%"
  },

  opacity: 0,

  y: 100,

  duration: 1.2

});


/* SKILLS */

gsap.from(".skill-box", {

  scrollTrigger: {

    trigger: "#skills",

    start: "top 80%"
  },

  opacity: 0,

  y: 80,

  duration: 1,

  stagger: .15

});


/* PROJECTS */

gsap.from(".project", {

  scrollTrigger: {

    trigger: "#projects",

    start: "top 80%"
  },

  opacity: 0,

  y: 120,

  duration: 1,

  stagger: .2

});


/* CONTACT */

gsap.from("#contact .card", {

  scrollTrigger: {

    trigger: "#contact",

    start: "top 80%"
  },

  opacity: 0,

  scale: .8,

  duration: 1.2

});


/* SECTION TITLES */

gsap.utils.toArray(".section-title")
.forEach(title => {

  gsap.from(title, {

    scrollTrigger: {

      trigger: title,

      start: "top 85%"
    },

    opacity: 0,

    y: 50,

    duration: 1

  });

});


/* ==========================================
   PROJECT MODAL
========================================== */

const modal =
  document.getElementById("modal");

const modalImage =
  document.getElementById("modal-image");

const closeBtn =
  document.querySelector(".close");

document
.querySelectorAll(".project")
.forEach(project => {

  project.addEventListener("click", () => {

    const image =
      project.querySelector("img");

    if (!image) return;

    modal.style.display = "block";

    modalImage.src = image.src;
  });

});


if(closeBtn){

  closeBtn.addEventListener("click", () => {

    modal.style.display = "none";

  });

}


window.addEventListener("click", (e) => {

  if (e.target === modal) {

    modal.style.display = "none";
  }

});


/* ==========================================
   VANILLA TILT
========================================== */

VanillaTilt.init(

  document.querySelectorAll(

    ".hero-image img, .card, .project, .skill-box"

  ),

  {

    max: 15,

    speed: 400,

    glare: true,

    "max-glare": 0.3

  }

);


/* ==========================================
   SMOOTH REVEAL
========================================== */

gsap.utils.toArray(

  ".card, .project, .skill-box"

).forEach(item => {

  gsap.from(item, {

    scrollTrigger: {

      trigger: item,

      start: "top 90%"
    },

    opacity: 0,

    y: 80,

    duration: 1

  });

});


/* ==========================================
   ACTIVE NAV LINK
========================================== */

const sections =
  document.querySelectorAll("section");

const navLinks =
  document.querySelectorAll("nav ul li a");

window.addEventListener("scroll", () => {

  let current = "";

  sections.forEach(section => {

    const sectionTop =
      section.offsetTop - 200;

    if (scrollY >= sectionTop) {

      current = section.getAttribute("id");
    }

  });

  navLinks.forEach(link => {

    link.classList.remove("active");

    if (

      link.getAttribute("href")
      .includes(current)

    ) {

      link.classList.add("active");
    }

  });

});