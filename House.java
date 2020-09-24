package wrapperPackage;

public interface House {
	default String getAddress() {
		return "A";
	}
}
