package iopvsoop.Visitor.NOIF;

/**
 * 
 * @author Stefano
 *
 * @param <T>
 */
public interface IEmployeeVisitor<T> {

	T visit(Director employee);
    T visit(Manager employee);
    T visit(Executive employee);
    T visit(Leader employee);
    T visit(OfficeWorker employee);
    
}
