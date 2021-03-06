package com.company.conjugateGradient;

import Jama.Matrix;

public class PolakRibiere extends ConjugateGradient {

    public PolakRibiere(double[][] A, double[] b) {
        super(A, b);
    }

    @Override
    protected double countStep(Matrix prev_r, Matrix r, Matrix p) {
        return scalarMultiply(r, r.minus(prev_r)) / scalarMultiply(prev_r, prev_r);
    }
}
