import { Component } from '@angular/core';
import { OwlOptions } from 'ngx-owl-carousel-o';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  isClicked = false;
  isAdded = false;
  // items = ['Item 1', 'Item 2', 'Item 3', 'Item 4', 'Item 5'];
  // customOptions: OwlOptions = {
  //   loop: true,
  //   mouseDrag: true,
  //   touchDrag: true,
  //   pullDrag: true,
  //   dots: false,
  //   navSpeed: 700,
  //   navText: ['<i class="fa-solid fa-circle-chevron-left"></i>', '<i class="fa-solid fa-circle-chevron-right"></i>'],
  //   responsive: {
  //     0: {
  //       items: 1
  //     },
  //     400: {
  //       items: 2
  //     },
  //     740: {
  //       items: 3
  //     },
  //     940: {
  //       items: 4
  //     }
  //   },
  //   nav: true
  // }
  slides = [
    {
      title: 'Slide 1',
      image: '../../assets/images/71dp6.jpg',
      alt: 'Slide 1'
    },
    {
      title: 'Slide 2',
      image: '../../assets/images/71eCvw1IqUL.jpg',
      alt: 'Slide 2'
    },
    {
      title: 'Slide 3',
      image: '../../assets/images/71eCvw1IqUL.jpg',
      alt: 'Slide 3'
    },
    {
      title: 'Slide 4',
      image: '../../assets/images/71eCvw1IqUL.jpg',
      alt: 'Slide 4'
    },
    {
      title: 'Slide 5',
      image: '../../assets/images/71eCvw1IqUL.jpg',
      alt: 'Slide 5'
    },
    {
      title: 'Slide 6',
      image: '../../assets/images/71eCvw1IqUL.jpg',
      alt: 'Slide 6'
    }
  ];

  customOptions = {
    loop: true,
    margin:10,
    nav: true,
    navText: ['<i class="fas fa-chevron-left"></i>', '<i class="fas fa-chevron-right"></i>'],
    rewind: false, // disable rewind
    responsiveClass: true,
    responsive: {
      0: {
        items: 1,
        nav: false
      },
      768: {
        items: 2,
        nav: false
      },
      1000: {
        items: 5,
        nav:true
      }
    }
  };


  toggleHeart() {
    this.isClicked = !this.isClicked;
  }
  

  toggleCart() {
    this.isAdded = !this.isAdded;
  }
}


