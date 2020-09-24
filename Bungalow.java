package wrapperPackage;

public interface Bungalow extends House{
	default String getAddress() {
		return "B";
	}
}
