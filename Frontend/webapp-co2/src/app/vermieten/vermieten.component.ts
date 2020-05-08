import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vermieten',
  templateUrl: './vermieten.component.html',
  styleUrls: ['./vermieten.component.scss']
})
export class VermietenComponent implements OnInit {

  clickCounter: number = 0;
  name: String = '';

  constructor() { }

  ngOnInit(): void {
  }

  countClick() {
    this.clickCounter += 1;
  }

  setClasses() {
    let myClass = {
      active: this.clickCounter > 4,
      nonactive: this.clickCounter <= 4,
    }
    return myClass;
  }
}
