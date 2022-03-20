import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Welcome Here';
  para='Let us learn the basics of angular';
  isSelected:boolean= true;
  text=''
  c:number=1;
  show()
  {
    alert('hey i am clicked');
    this.text = `Button clicked ${this.c++} times`;
  }
}
