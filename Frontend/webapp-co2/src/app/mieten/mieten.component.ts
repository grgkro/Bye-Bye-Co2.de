import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { trigger,style,transition,animate,keyframes,query,stagger } from '@angular/animations';


@Component({
  selector: 'app-mieten',
  templateUrl: './mieten.component.html',
  styleUrls: ['./mieten.component.scss'],
  animations: [
    trigger('listStagger', [
      transition('* <=> *', [
        query(
          ':enter',
          [
            style({ opacity: 0, transform: 'translateY(-15px)' }),
            stagger(
              '50ms',
              animate(
                '550ms ease-out',
                style({ opacity: 1, transform: 'translateY(0px)' })
              )
            )
          ],
          { optional: true }
        ),
        query(':leave', animate('50ms', style({ opacity: 0 })), {
          optional: true
        })
      ])
    ])
  ]
})
export class MietenComponent implements OnInit {
  roofs: any;

  constructor(private _http: HttpService) { }

  ngOnInit(): void {
    this._http.getRoofOffers().subscribe(data => this.roofs = data)
    
  }

}
