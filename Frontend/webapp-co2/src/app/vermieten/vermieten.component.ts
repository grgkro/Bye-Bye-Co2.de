import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-vermieten',
  templateUrl: './vermieten.component.html',
  styleUrls: ['./vermieten.component.scss']
})
export class VermietenComponent implements OnInit {

  clickCounter: number = 0;
  name: String = '';
  roofs: Object;

  constructor(private _http: HttpService) { }

  ngOnInit(): void {
    this._http.getRoofs().subscribe(data => {
      this.roofs = data;
      console.log(this.roofs);
    });
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
