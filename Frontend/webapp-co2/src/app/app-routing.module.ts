import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VermietenComponent } from './vermieten/vermieten.component' 
import { MietenComponent } from './mieten/mieten.component' 

const routes: Routes = [
  { path: '', component: VermietenComponent},
  { path: 'mieten', component: MietenComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
