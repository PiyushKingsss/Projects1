import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule} from '@angular/forms'
import { ConvertToSpacesPipe } from 'src/app/Product/convert-to-spaces.pipe';

declarations: [
  AppComponent,
  
  ConvertToSpacesPipe
]


     
const routes: Routes = [{
  
     
  path:'',
  component:AppComponent
},
     

 

     
]
     
@NgModule({
  declarations: [
    AppComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
     
     
