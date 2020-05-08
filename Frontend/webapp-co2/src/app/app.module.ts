import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VermietenComponent } from './vermieten/vermieten.component';
import { MietenComponent } from './mieten/mieten.component';


@NgModule({
  declarations: [
    AppComponent,
    VermietenComponent,
    MietenComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
