package by.bsu.fami.etl.processing.component;

import java.util.List;

import by.bsu.fami.etl.processing.document.Document;

public class BaseFilter extends Component {

	public List<Document> execute(Document document) {
		// TODO Auto-generated method stub
		if (!document.getTransactiontype().equals("Delete")) {
			callAll(document);
		}
		return null;
	}

}
