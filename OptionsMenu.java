package ClassExcerises.GUI;

import javax.swing.*;

public class OptionsMenu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Options Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Separator line
        fileMenu.add(exitItem);

        // Create the "Edit" menu category
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        JMenu optionsMenu = new JMenu("Options");

        JMenu NumericalSubMenu = new JMenu("Numerical Skills");
        JMenuItem Surds = new JMenuItem("Working With Surds");
        JMenuItem Indices = new JMenuItem("The Laws of Indices");
        JMenuItem Rounding = new JMenuItem("Rounding");
        JMenuItem ReversePercentages = new JMenuItem("Reverse Percentages");
        JMenuItem Interest = new JMenuItem("Interest");
        JMenuItem Fractions = new JMenuItem("Fractions");

        NumericalSubMenu.add(Surds);
        NumericalSubMenu.add(Indices);
        NumericalSubMenu.add(Rounding);
        NumericalSubMenu.add(ReversePercentages);
        NumericalSubMenu.add(Interest);
        NumericalSubMenu.add(Fractions);

        JMenu AlgebraSubMenu = new JMenu("Algebraic Skills");
        JMenuItem ExpansionOfBrackets = new JMenuItem("Expansion of Brackets");
        JMenuItem Factoring = new JMenuItem("Factoring");
        JMenuItem Quadratics = new JMenuItem("Quadratics");
        JMenuItem SimplifyingAlgebraicEquations = new JMenuItem("Simplifying Algebraic Equations");
        JMenuItem AlgebraicOperations = new JMenuItem("Algebraic Operations");
        JMenuItem StraightLine = new JMenuItem("The Equation of a Straight Line");
        JMenuItem LinearEquations = new JMenuItem("Linear Equations and Inequalities");
        JMenuItem ChangeSubject = new JMenuItem("Change the Subject of a Formula");
        JMenuItem EquationFromFunc = new JMenuItem("Determine the Equation of a Quadratic Function from its Graph");
        JMenuItem SketchQuadratic = new JMenuItem("Sketching a Quadratic Function");
        JMenuItem Features = new JMenuItem("Identifying Features of a QF");
        JMenuItem SolveEQ = new JMenuItem("Solving a Quadratic Equation");
        JMenuItem QuadFormula = new JMenuItem("The Quadratic Formula");
        JMenuItem Discriminants = new JMenuItem("Discriminants");

        AlgebraSubMenu.add(ExpansionOfBrackets);
        AlgebraSubMenu.add(Factoring);
        AlgebraSubMenu.add(Quadratics);
        AlgebraSubMenu.add(SimplifyingAlgebraicEquations);
        AlgebraSubMenu.add(AlgebraicOperations);
        AlgebraSubMenu.add(StraightLine);
        AlgebraSubMenu.add(LinearEquations);
        AlgebraSubMenu.add(ChangeSubject);
        AlgebraSubMenu.add(EquationFromFunc);
        AlgebraSubMenu.add(SketchQuadratic);
        AlgebraSubMenu.add(Features);
        AlgebraSubMenu.add(SolveEQ);
        AlgebraSubMenu.add(QuadFormula);
        AlgebraSubMenu.add(Discriminants);

        JMenu GeometricSubMenu = new JMenu("Geometric Skills");
        JMenuItem Gradient = new JMenuItem("Gradient");
        JMenuItem Circles = new JMenuItem("Circles");
        JMenuItem Volume = new JMenuItem("Volume");
        JMenuItem Pythagoras = new JMenuItem("Pythagoras");
        JMenuItem PropertiesAngles = new JMenuItem("Properties of Angles");
        JMenuItem Similarity = new JMenuItem("Similarity");
        JMenuItem Vectors = new JMenuItem("Vectors");
        JMenuItem ThreeCoOrdinates = new JMenuItem("Three D Co-ordinates");
        JMenuItem VectorComponents = new JMenuItem("Vector Components");
        JMenuItem Magnitude = new JMenuItem("Magnitude");

        GeometricSubMenu.add(Gradient);
        GeometricSubMenu.add(Circles);
        GeometricSubMenu.add(Volume);
        GeometricSubMenu.add(Pythagoras);
        GeometricSubMenu.add(PropertiesAngles);
        GeometricSubMenu.add(Similarity);
        GeometricSubMenu.add(Vectors);
        GeometricSubMenu.add(ThreeCoOrdinates);
        GeometricSubMenu.add(VectorComponents);
        GeometricSubMenu.add(Magnitude);

        JMenu TrigonometricSubMenu = new JMenu("Trigonometry");
        JMenuItem GraphsTrig = new JMenuItem("Trigonometric Graphs");
        JMenuItem DegreesTrig = new JMenuItem("Degrees & Relationships");
        JMenuItem AreaTrig = new JMenuItem("Trigonometric Areas");
        JMenuItem SinCosRule = new JMenuItem("Sine/CoSine Rules");
        JMenuItem Bearings = new JMenuItem("Bearings");

        TrigonometricSubMenu.add(GraphsTrig);
        TrigonometricSubMenu.add(DegreesTrig);
        TrigonometricSubMenu.add(AreaTrig);
        TrigonometricSubMenu.add(SinCosRule);
        TrigonometricSubMenu.add(Bearings);

        JMenu StatsSubMenu = new JMenu("Statistical Skills");
        JMenuItem CompareData = new JMenuItem("Compare Data");
        JMenuItem LinearModel = new JMenuItem("Linear Model");

        StatsSubMenu.add(CompareData);
        StatsSubMenu.add(LinearModel);

        optionsMenu.add(AlgebraSubMenu);
        optionsMenu.add(NumericalSubMenu);
        optionsMenu.add(TrigonometricSubMenu);
        optionsMenu.add(GeometricSubMenu);
        optionsMenu.add(StatsSubMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(optionsMenu);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}