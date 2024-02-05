import { useState } from "react";

// ListGroup.tsx
function ListGroup() {
  let items = ["Jason", "Mary", "Kelsy", "Francis", "Kai"];
  //Hook
  const [selectedIndex, setSelectedIndex] = useState(-1);


  const getMsg = () => {
    return items.length === 0 ? <p>No item found</p> : null;
  };

  return (
    <>
      <h1>List</h1>
      {items.length === 0 && <p>No item found</p>}
      <ul className="list-group">
        {items.map((item, index) => (
          <li
            className={selectedIndex === index ? 'list-group-item active': 'list-group-item'}
            key={item}
            onClick={()=>{setSelectedIndex(index);}}
          >
            {item}
          </li>
        ))}
      </ul>
    </>
  );
}

export default ListGroup;
