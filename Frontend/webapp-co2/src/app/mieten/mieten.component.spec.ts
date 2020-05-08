import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MietenComponent } from './mieten.component';

describe('MietenComponent', () => {
  let component: MietenComponent;
  let fixture: ComponentFixture<MietenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MietenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MietenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
