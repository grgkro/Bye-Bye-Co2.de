import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VermietenComponent } from './vermieten.component';

describe('VermietenComponent', () => {
  let component: VermietenComponent;
  let fixture: ComponentFixture<VermietenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VermietenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VermietenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
