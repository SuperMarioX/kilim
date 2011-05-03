package kilim.mirrors;

public abstract class ClassMirror {

	public abstract MethodMirror[] getDeclaredMethods();

	public abstract boolean isAssignableFrom(ClassMirror c) throws ClassMirrorNotFoundException;

	public abstract ClassMirror getSuperclass() throws ClassMirrorNotFoundException;

	public abstract ClassMirror[] getInterfaces() throws ClassMirrorNotFoundException;

	public abstract boolean isInterface();

	public abstract String getName();

}
