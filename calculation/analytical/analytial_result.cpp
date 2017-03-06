  // cl -EHsc H:\Research\documents\CityModel\Graph\RWP.cpp
#include <stdio.h>
#include <conio.h>
#include <math.h>
#include <iostream>
using namespace std;

int main(){

    cout << "Simulation Result" << endl;
	float a=4;		//km , = 36000 meter
	float b=9;
//	b = 10;		//km, = 24000 meter
	float Sx= 0.2;	//km = 200 m
	float Sy= 0.090;	// km = 200m
	float K;

	// probability of spotlight
    float fi = 0;
    // spotlight delay
    float lamda = 60;

    // This line is for debuging with the sir's analytical parameter.
    // Comment out this line later
//	a = 36; b= 36; Sx=.24; Sy=.24; fi=.4; lamda=50;

	float Na = (a/Sx) + 1;
	float Ns = (b/Sy) + 1;

	float Lx = a * (Na + 1) / (3 * Na);
	float Ly = b * (Ns + 1) / (3 * Ns);

//	cout << "a " << a << "  ...Na: " << Na << " Ns: "<< Ns << endl;

	float EL = Lx + Ly;

	cout << "EL is: " << EL << endl;

	float VL = Sx*Sx*(Na*Na -1)/18.0 + (Sy*Sy*(Ns*Ns-1))/18;

    cout << "VL is: " << VL << endl;


    float Txroad = fi * lamda * (Lx/Sx + Ly/Sy);
//    cout << "Txrod " << Txroad << endl;

    float Xx = .1;
    float Vx = .016;
    float Vy = .016;
    float Tx = 4 * Xx * Sx / Vx + Lx * (1 + 2 * fi * Xx) / Vx;
    float Ty = 4 * Xx * Sx / Vy + Ly * (1 + 2 * fi * Xx) / Vy;

    float ET = Tx + Ty + Txroad;
    ET = ET / 60;
    cout << "ET is : " << ET << " min " << endl;

//    cin >> ET;


    float ECx, ECy;
    float r = .5; //KM

//    b = 24;
////    Na = 151;
//    Ns = 101;
    float m = (sqrt(2) * a - 2 * (sqrt(2) -1) * r) / (2*r);
    float n = (sqrt(2) * b - 2 * (sqrt(2) -1) * r) / (2*r);

//    cout << "m is : " << m << endl;

    K = a / (m * Sx);
//    cout << "K is : " << K << endl;
    ECx = ((m * (m+1) * K) * (6*Na - 4*m*K + K +3))/ (6 * Na *Na);
    ECy = ((n * (n+1) * K) * (6*Ns - 4*n*K + K +3))/ (6 * Ns *Ns);

    float Ec = ECx + ECy;

    cout << "E(C): " << Ec << endl;

    float Tr = ET * 60/Ec;

    cout << "Tr(sec): " << Tr << endl;


    cout << "over" << endl;



		// so radius = 200*5 /2 = 500 meter
//	float m,n,r;
//	double arc1,arc2;
//
//	double E_l, E_C, E_T;;
//
//	float V_max = 108;  // km/h
//	float V_min = 18;
//
//	float E_u = 4;
//	double res;
//	double t1,t2;
//
//	r = (K* Sx)/2;
//	m = a/(2*r);
//	n = b/(2*r);
//	printf("\n m = %f ",m);
//	printf("\n n = %f ",n);
//
//
//	t1 = sqrt(a*a + b*b)/b ;
//	arc1 = log(t1 + sqrt (t1*t1 -1) );
//
//
//    t2 = sqrt(a*a + b*b) /a ;
//    arc2 = log(t2 + sqrt (t2*t2 -1) );
//
//	E_l = (1.0/15)*(  (a*a*a)/(b*b)  + (b*b*b)/(a*a)  + sqrt(a*a+b*b)*(3- ((a*a)/(b*b)) - ((b*b)/(a*a)) ) );
//	E_l = E_l + (1.0/6)*( (b*b/a)* arc1 + (a*a/b) * arc2 );
//	printf("\n RWP E(l) = %lf", E_l);
//
//	E_T = (E_l * 3600*log(V_max/V_min))/(V_max - V_min);
//	printf("\n E_T = %lf", E_T);
//
//	E_C = (1.0/3)* (m + n -1/m -1/n);
//	printf("\n E_C = %lf", E_C);
//
//	res = (E_T + E_u)/E_C;
//	printf("\n Residence time = %lf\n", res);



}
