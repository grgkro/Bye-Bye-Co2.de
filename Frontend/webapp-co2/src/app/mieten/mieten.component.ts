import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-mieten',
  templateUrl: './mieten.component.html',
  styleUrls: ['./mieten.component.scss']
})
export class MietenComponent implements OnInit {
  roofs: any;

  constructor(private _http: HttpService) { }

  ngOnInit(): void {
    this._http.getRoofOffers().subscribe(data => this.roofs = data)
    
  }

}
