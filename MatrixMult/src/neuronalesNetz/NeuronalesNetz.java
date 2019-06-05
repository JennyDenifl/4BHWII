package neuronalesNetz;

import matrix.Matrix;
import matrix.BadMatrix;
import matrix.LengthMismatch;


public class NeuronalesNetz {
	
	public static float[] Bias(){
		float[] b = new float[10];
		return b;
	}
	
	
	public static float[] Input(){
		float[] in = new float[20];
		return in;
	}
	
	public float[][] Hiddenlayer(){
		float[][] hl = new float[(int) Math.random()*10][(int) Math.random()*10];
		return hl;
	}
	
	public float[] Output(){
		float[] out = new float[2];
		return out;
	}
	
	
	public static Matrix Weight(){
		Matrix w = null;
		for(int i=0;i< Matrix.getR();i++) {
			for(int j=0;j<Matrix.getC();j++) {
				 Matrix.mat[i][j] = Matrix.mat[(int) Math.random()*10][(int) Math.random()*10];
			}
		}
		return w;
	}
	
	
	
	public static void ANN() throws LengthMismatch, BadMatrix{
		float[] m = Matrix.vertMult(Weight(), Input());
		Matrix.sigmoidFunc(Matrix.vertMult(Input(), Weight()), Matrix.addVec(m, Bias()));
	}
	
	
	
	public static float Mutation(){		
		float mut = (float) (Math.random() * 5);
		return mut;
	}
	
	public static void Crossover(){
		float best1 = 0;
		float best2 = 0;
		
		for(int i =0; i < best1; i++){
			for(int j =0; j < best2; j++){
				float neu = best1* Mutation() + best2 * Mutation();
			}
		}
	}
}
