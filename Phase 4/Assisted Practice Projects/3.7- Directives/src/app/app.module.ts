import { ChangeColorDirective } from './ChangeColor.directive';

@NgModule({
    imports: [
        SharedModule,
        AppRoutingModule
  
    ],
  
    declarations: [
        ChangeColorDirective,
        ProductComponent,
        MyUpperPipe,
        DiscountPipe,
        ProductSearch,
        ProductDetailComponent
    
    ],
})

