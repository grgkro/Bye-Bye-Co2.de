import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VermietenComponent } from './vermieten/vermieten.component';
import { MietenComponent } from './mieten/mieten.component';
import { KontaktComponent } from './kontakt/kontakt.component';


@NgModule({
  declarations: [
    AppComponent,
    VermietenComponent,
    MietenComponent,
    KontaktComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
