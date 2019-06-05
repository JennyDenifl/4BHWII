package matrix;


public class Matrix {
	public static float[][] mat;
	public static  int r;
	static int c;
	

	public Matrix(int r, int c) {
		mat = new float[r][c];
		this.setR(r);
		this.setC(c);
	}



	public Matrix copy() {

		Matrix copy = new Matrix(this.getR(), this.getC());

		for (int i = 0; i < getR(); i++) {

			for (int j = 0; j < getC(); j++) {

				copy.mat[i][j] = this.mat[i][j];

			}

		}

		return copy;

	}

	public static void sigmoidFunc(float[][] fs, float[] fs2) throws BadMatrix{

		try {

		for(int i=0;i<getR();i++) {
			for(int j=0;j<getC();j++) {
				mat[i][j]=(float) (1/(Math.exp(-mat[i][j])+1));
			}
		}
		}

		catch(ArrayIndexOutOfBoundsException e) {

			throw new BadMatrix();

		}

	}

	public void skalarMult(float s) throws BadMatrix{

		try {

		for (int i = 0; i < getR(); i++) {

			for (int j = 0; j < getC(); j++) {

				mat[i][j] *= s;

			}

		}

		}

		catch(ArrayIndexOutOfBoundsException e) {

			throw new BadMatrix();

		}

	}



	public static Matrix skalarMult(float s, Matrix m) throws BadMatrix {

		Matrix copy = m.copy();

		copy.skalarMult(s);

		return copy;

	}



	public static float[][] vertMult(float[] v, Matrix m) throws LengthMismatch, BadMatrix {

		Matrix end=m.copy();

		if(v.length!=m.getC()) {

			throw new LengthMismatch();

		}

		try {

		for (int i = 0; i < m.getR(); i++) {

			for (int j = 0; j < m.getC(); j++) {

				end.mat[i][j] = m.mat[i][j] * v[i];

			}

		}

		}

		catch(ArrayIndexOutOfBoundsException e) {

			throw new BadMatrix();

		}

		return end.mat;

	}



	public static float[] horizonMult(float[] v, Matrix m) throws LengthMismatch, BadMatrix {

		float[] nv=new float[v.length];

		if(v.length!=m.getR()) {

			throw new LengthMismatch();

		}

		try {

		for(int i=0;i<m.getR();i++) {

			float zw=0;

			for(int j=0;j<m.getC();j++) {

				zw+=m.mat[j][i]*v[j];

			}

			nv[i]=zw;

		}

		}

		catch(ArrayIndexOutOfBoundsException e) {

			throw new BadMatrix();

		}

		return nv;

	}

	public static float[] vertMult(Matrix m, float[] v) throws LengthMismatch, BadMatrix {

		float[] nv=new float[v.length];

		if(v.length!=m.getC()) {

			throw new LengthMismatch();

		}

		try {

		for(int i=0;i<m.getR();i++) {

			float zw=0;

			for(int j=0;j<m.getC();j++) {

				zw+=m.mat[i][j]*v[j];

			}

			nv[i]=zw;

		}

		}

		catch(ArrayIndexOutOfBoundsException e) {

			throw new BadMatrix();

		}

		return nv;

	}

	public static float[][] horizonMult(Matrix m, float[] v) throws LengthMismatch, BadMatrix {

		Matrix end=m.copy();

		if(v.length!=m.getR()) {

			throw new LengthMismatch();

		}

		try {

		for (int i = 0; i < m.getR(); i++) {

			for (int j = 0; j < m.getC(); j++) {

				end.mat[i][j] = m.mat[i][j] * v[j];

			}

		}

		}

		catch(ArrayIndexOutOfBoundsException e) {

			throw new BadMatrix();

		}

		return end.mat;

	}

	public static Matrix matMult(Matrix m, Matrix n)throws BadMatrix{

		Matrix e;

		if(m.getR()<=n.getR() && m.getC()>=n.getC()) {

			e= new Matrix(m.getR(),n.getC());

			try {

			for(int i=0;i<m.getR();i++){

				float zw=0;

				for(int j=0;j<n.getC();j++){

					for(int k=0;k<n.getR();k++) {

						zw+=m.mat[i][k]*n.mat[k][j];

					}

					e.mat[i][j]=zw;

				}

			}

			}

			catch(ArrayIndexOutOfBoundsException k) {

				throw new BadMatrix();

			}

		}

		else if(m.getR()>=n.getR() && m.getC()<=n.getC()) {

			e= new Matrix(n.getR(),m.getC());

			try {

				for(int i=0;i<n.getR();i++){

					float zw=0;

					for(int j=0;j<m.getC();j++){

						for(int k=0;k<m.getR();k++) {

							zw+=n.mat[i][k]*m.mat[k][j];

						}

						e.mat[i][j]=zw;

					}

				}

				}

				catch(ArrayIndexOutOfBoundsException k) {

					throw new BadMatrix();

				}

		}

		else {

			throw new BadMatrix();

		}

		

		return e;

	}

	public static Matrix addMat(Matrix m, Matrix n){

		Matrix e= new Matrix(m.getR(),m.getC());

		for(int i=0;i<m.getR();i++){

			for(int j=0;j<m.getC();j++){

				e.mat[i][j]=m.mat[i][j]+n.mat[i][j];

			}

		}

		return e;

	}
	
	public static float[] addVec(float[] m, float[] n){

		float[] e= new float[m.length];

		for(int i=0;i<m.length;i++){
			e[i]=m[i]+n[i];

		}

		return e;

	}



	public boolean equals(Matrix m) {

		for(int i=0;i<getR();i++) {

			for(int j=0;j<getC();j++) {

				if(mat[i][j]!=m.mat[i][j]) {

					return false;

				}

			}

		}

		return true;

	}



	public static int getR() {
		return r;
	}



	public static void setR(int r) {
		Matrix.r = r;
	}



	public static int getC() {
		return c;
	}



	public static void setC(int c) {
		Matrix.c = c;
	}
}
