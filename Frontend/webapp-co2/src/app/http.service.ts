import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Roof } from './_models/roof';

@Injectable({
  providedIn: 'root'
})
export class HttpService {

  serverPath = 'http://localhost:8090';

  constructor(private http: HttpClient) { }

  getRoofs() {
    return this.http.get(this.serverPath + '/roofs/getAllRoofs');
  }

  saveRoof(roof: Roof) {
    console.log("yeah");
    return this.http.post(this.serverPath + '/roofs/saveRoof', roof)
  }
}
